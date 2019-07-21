package com.example.repos;

import com.example.domain.Files;
import org.springframework.data.repository.CrudRepository;


public interface FilesRepo extends CrudRepository<Files,Long> {
}
