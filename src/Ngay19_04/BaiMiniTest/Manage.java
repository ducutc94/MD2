package Ngay19_04.BaiMiniTest;

import java.util.List;

public interface Manage<E> {
    void creat();
    List<E> edit();
    E delete();
    E search();
    void  displayAll();

}
