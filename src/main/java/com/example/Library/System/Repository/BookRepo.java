package com.example.Library.System.Repository;

import com.example.Library.System.Models.Books;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository <Books,Long> {
}
