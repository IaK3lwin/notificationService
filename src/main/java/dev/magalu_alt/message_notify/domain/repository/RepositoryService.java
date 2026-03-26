package dev.magalu_alt.message_notify.domain.repository;

public interface RepositoryService<Type> {
  public Type getWithId(String id);

  public Type[] getAll();

  public void save(Type object);

  public void update(Type object);
}
