package org.bitfly.stocktrack;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

    private final TestRepository repository;

    TestController(TestRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/tests")
    List<Test> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/tests")
    Test newTest(@RequestBody Test newTest) {
        return repository.save(newTest);
    }

    // Single item

    @GetMapping("/tests/{id}")
    Test one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new TestNotFoundException(id));
    }

    @PutMapping("/tests/{id}")
    Test replaceTest(@RequestBody Test newTest, @PathVariable Long id) {

        return repository.findById(id)
                .map(test -> {
                    test.setName(newTest.getName());
                    return repository.save(test);
                })
                .orElseGet(() -> {
                    newTest.setId(id);
                    return repository.save(newTest);
                });
    }

    @DeleteMapping("/tests/{id}")
    void deleteTest(@PathVariable Long id) {
        repository.deleteById(id);
    }
}