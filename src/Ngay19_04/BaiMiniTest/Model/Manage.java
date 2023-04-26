package Ngay19_04.BaiMiniTest.Model;

import java.io.IOException;

public interface Manage<E> {
    void creat() throws IOException;
    void edit() throws IOException;
    E delete() throws IOException;
    E search();
    void  displayAll();

}
