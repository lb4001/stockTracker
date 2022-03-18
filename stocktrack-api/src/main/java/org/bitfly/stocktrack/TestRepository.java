package org.bitfly.stocktrack;

import org.springframework.data.jpa.repository.JpaRepository;

interface TestRepository extends JpaRepository<Test, Long> {

}

class TestNotFoundException extends RuntimeException {

    TestNotFoundException(Long id) {
        super("Could not find test " + id);
    }
}