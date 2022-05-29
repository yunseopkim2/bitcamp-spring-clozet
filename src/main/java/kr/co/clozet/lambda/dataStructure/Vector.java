package kr.co.clozet.lambda.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
/**
 * packageName: kr.co.clozet.common.dataStructure
 * fileName        : Vector
 * author           : kimyunseop
 * date               : 2022-05-12
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
@Component @Data @Lazy
public class Vector<T> {
    private ArrayList<T> list;
    public Vector() { this.list = new ArrayList<>();}

    public void add(T t){
            list.add(t);
        }
    public void set(T t, int i){
            list.set(i, t);
        }
    public void remove(T t){
            list.remove(t);
        }
    public T get(int i){
            return list.get(i);
        }
    public ArrayList<T> get(){
            return list;
        }
    public int size(){
            return list.size();
        }
    public void clear(){
            list.clear();
        }

}
