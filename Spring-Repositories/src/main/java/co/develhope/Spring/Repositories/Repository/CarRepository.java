package co.develhope.Spring.Repositories.Repository;

import co.develhope.Spring.Repositories.Model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car, Integer> {
}
