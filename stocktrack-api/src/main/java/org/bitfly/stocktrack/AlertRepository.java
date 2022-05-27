package org.bitfly.stocktrack;

import org.springframework.data.jpa.repository.JpaRepository;

interface AlertRepository extends JpaRepository<Alert, Long> {

}

class AlertNotFoundException extends RuntimeException {

    AlertNotFoundException(Long id) {
        super("Could not find alert " + id);
    }
}