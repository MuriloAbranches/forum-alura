package com.muriloabranches.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muriloabranches.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
