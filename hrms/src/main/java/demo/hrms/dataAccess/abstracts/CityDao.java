package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City,Integer> {

}
