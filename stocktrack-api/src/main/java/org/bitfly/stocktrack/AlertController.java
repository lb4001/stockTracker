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
class AlertController {

    private final AlertRepository repository;

    AlertController(AlertRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]     //gets all alerts?
    @GetMapping("/Alerts")
    List<Alert> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/Alerts")
    Alert newAlert(@RequestBody Alert newAlert) {
        return repository.save(newAlert);
    }

    // Single item

    @GetMapping("/Alerts/{id}")
    Alert one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new AlertNotFoundException(id));
    }

    @PutMapping("/Alerts/{id}")
    Alert replaceAlert(@RequestBody Alert newAlert, @PathVariable Long id) {

        return repository.findById(id)
                .map(Alert -> {
                    Alert.setId(newAlert.getId());
                    return repository.save(Alert);
                })
                .orElseGet(() -> {
                    newAlert.setId(id);
                    return repository.save(newAlert);
                });
    }

    @DeleteMapping("/Alerts/{id}")
    void deleteAlert(@PathVariable Long id) {
        repository.deleteById(id);
    }
}