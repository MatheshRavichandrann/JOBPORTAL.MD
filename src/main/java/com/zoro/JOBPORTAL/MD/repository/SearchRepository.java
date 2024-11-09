package com.zoro.JOBPORTAL.MD.repository;
import com.zoro.JOBPORTAL.MD.model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
