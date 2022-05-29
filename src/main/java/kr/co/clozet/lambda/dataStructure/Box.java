package kr.co.clozet.lambda.dataStructure;

import kr.co.clozet.clozet.domains.User;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.clozet.common.dataStructure
 * fileName        : Box
 * author           : kimyunseop
 * date               : 2022-05-12
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
@Component @Data @Lazy
public class Box<K, V>{
    private final HashMap<K, V> map;
    public Box(){
        this.map = new HashMap<>();
    }
    public void put(K k, V v){
        map.put(k, v);
    }
    public void replace(K k, V v){
        map.replace(k, v);
    }
    public void remove(K k, V v){map.remove(k, v);}
    public V get(K k){
        return map.get(k);
    }
    public int size(){
        return map.size();
    }
    public boolean containsKey(K k){
        return map.containsKey(k);
    }
    //public List<V> values(){return new ArrayList<>(map.values());}
    public List<V> values(){return map.values().stream().collect(Collectors.toList());}
    public void clear(){
        map.clear();
    }
    //User custom
    // 이름으로 검색된 회원 목록요청시(필터가 없는경우 리엑트에 던진다)
    public List<User> findByUserName(String name){
        List<User> ls = new ArrayList<>();
        for(User v: ls ){
            if (name.equals(v.getName())){ls.add(v);}
        }
        return ls;
    }
    //회원 아이디 목록요청시
        public List<V> findAllUserKeyList(){
            List<V> ls = new ArrayList<>();
            for(Map.Entry<K, V> e: map.entrySet()){
                ls.add((V)e.getValue());
            }
            return ls;
        }
    // 테이블 행목록요청시
    public List<User> findAllUserList(){
        List<User> ls = new ArrayList<>();
        for(Map.Entry<K, V> e: map.entrySet()){
            ls.add((User)e.getValue());
        }
        return ls;
    }
    // 이름으로 검색된 회원 목록요청시
    public Map<String, User> mapFindByUesrName(String name){
        Map<String, User> map = new HashMap<>();
        for(Map.Entry<String, User> e: map.entrySet()){
            if(name.equals(e.getValue().getName())) map.put(e.getKey(), e.getValue());
        }

        return map;
    }

}
