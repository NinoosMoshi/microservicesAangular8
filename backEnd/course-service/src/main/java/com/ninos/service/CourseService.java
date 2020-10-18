package com.ninos.service;

import com.ninos.model.Course;
import com.ninos.model.Transaction;

import java.util.List;

public interface CourseService {

    List<Course> allCourses();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);

}
