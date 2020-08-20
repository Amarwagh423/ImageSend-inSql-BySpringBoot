package com.jbk.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jbk.Model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByName(String name);
}