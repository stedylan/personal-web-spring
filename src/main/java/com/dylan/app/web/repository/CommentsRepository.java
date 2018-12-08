package com.dylan.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dylan.app.web.model.*;
import org.springframework.stereotype.Component;

@Component
public interface CommentsRepository extends JpaRepository<Comments, String> {
}
