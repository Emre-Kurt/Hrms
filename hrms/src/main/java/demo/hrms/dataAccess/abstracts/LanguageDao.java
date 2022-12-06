package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
