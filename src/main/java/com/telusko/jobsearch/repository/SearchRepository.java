package com.telusko.jobsearch.repository;


import java.util.List;

import com.telusko.jobsearch.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}