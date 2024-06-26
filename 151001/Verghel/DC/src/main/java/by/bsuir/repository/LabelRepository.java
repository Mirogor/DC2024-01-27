package by.bsuir.repository;

import by.bsuir.entities.Message;
import by.bsuir.entities.Label;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LabelRepository extends JpaRepository<Label, Long>, JpaSpecificationExecutor<Label> {
    Page<Label> findAll(Pageable pageable);
}
