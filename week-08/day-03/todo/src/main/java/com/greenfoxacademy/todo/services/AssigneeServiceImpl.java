package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.interfaces.AssigneeRepository;
import com.greenfoxacademy.todo.models.Assignee;
import org.springframework.stereotype.Service;

@Service
public class AssigneeServiceImpl implements com.greenfoxacademy.todo.services.AssigneeService {
    private AssigneeRepository assigneeRepository;

    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public void save(Assignee todo) {
        assigneeRepository.save(todo);
    }

    @Override
    public Iterable<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    @Override
    public Assignee findById(long id) {
        return assigneeRepository.findById(id).get();
    }

    @Override
    public void updateAssignee(Assignee todo) {
        assigneeRepository.save(todo);
    }

    @Override
    public void deleteAssignee(Assignee assignee) {
        assigneeRepository.delete(assignee);
    }

}