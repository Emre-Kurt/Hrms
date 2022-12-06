package demo.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill,Integer>{

}
