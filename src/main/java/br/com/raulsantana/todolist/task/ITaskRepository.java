package br.com.raulsantana.todolist.task;

import java.util.List;
import java.util.UUID;

import br.com.raulsantana.todolist.task.TaskModel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID>{
    List<TaskModel> findByIdUser(UUID idUser);
}
