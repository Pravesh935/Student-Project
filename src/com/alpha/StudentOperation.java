package com.alpha;

public interface StudentOperation {
  public Student FindStudent(int id);
  public void AddStudent(Student s);
  public void Delete(int id);
  public void Update(int id, String name);
}
