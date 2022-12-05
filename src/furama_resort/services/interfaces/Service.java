package furama_resort.services.interfaces;



public interface Service  {
    void display() throws Exception;

    void addNew() throws Exception;

    void edit() throws Exception;

    void delete() throws Exception;

    void findByName();
}
