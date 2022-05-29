package kr.co.clozet.lambda.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-05-09
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
public class ItemCRUD {
    public static void main(String[] args) {
    ItemService service = new ItemServiceImpl();
    }
    @Data @AllArgsConstructor
    static class Item{
        private int id;
        private String name;
        private int price;

    }

    interface ItemService{
        void save(Item item);
        void delete(Item item);
        void update(Item item);
        Item findById(String id);
        Item findByName(String name);
        Item findAll();
        boolean existsById(String id);
        int count();

    }
    static class ItemServiceImpl implements ItemService{
        private Map<String, Item> map;
        ItemServiceImpl(){
            this.map = new HashMap<>();
        }

        @Override
        public void save(Item item) {

        }

        @Override
        public void delete(Item item) {

        }

        @Override
        public void update(Item item) {

        }

        @Override
        public Item findById(String id) {
            return null;
        }

        @Override
        public Item findByName(String name) {
            return null;
        }

        @Override
        public Item findAll() {
            return null;
        }

        @Override
        public boolean existsById(String id) {
            return false;
        }

        @Override
        public int count() {
            return map.size();
        }
    }

}
