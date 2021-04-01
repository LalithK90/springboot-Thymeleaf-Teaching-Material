package lk.lalithk90.springboot_thymelaf.final_class.util.interfaces;

import java.util.List;

public interface AbstractService< E, ID > {
  List< E > findAll();

  E findById(ID id);

  E persist(E e);

  boolean delete(ID id);
}
