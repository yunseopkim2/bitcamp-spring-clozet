package kr.co.clozet.lambda.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.co.clozet.common.dataStructure
 * fileName        : BmiList
 * author           : kimyunseop
 * date               : 2022-05-09
 * ================================
 * DATE          AUTHOR       NOTE
 * ================================
 * 2022-02-19   kimyunseop   최초 생성
 */
// height weight ssn(생년월일) (980101-1)
public class BmiList {
    public static void main(String[] args) {

    }
    @Data @NoArgsConstructor
    static class Bmi{
        private int ssn;
        private double height, weight;
        private String gender;


        public Bmi(Builder builder){
            this.height = builder.height;
            this.weight = builder.weight;
            this.ssn = builder.ssn;
            this.gender = builder.gender;
        }
        static class Builder{
            private int ssn;
            private double height, weight;
            private String gender;


            public Builder (){}
            public Builder ssn(int ssn){this.ssn=ssn; return this;}
            public Builder height(double height){this.height=height; return this;}
            public Builder weight(double weight){this.weight=weight; return this;}
            public Builder gender(String gender){this.gender=gender; return this;}
            Bmi build(){return new Bmi(this);}
        }

    }
    interface BmiService{
        void save(Bmi bmi);
        void update(Bmi bmi, int i);
        void delete(Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findById(int i);
        List<Bmi> findByGender(String gender);
        int count();
        void clear();
    }
    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> list;

        BmiServiceImpl(){
            this.list = new ArrayList<Bmi>();
        }
        @Override
        public void save(Bmi bmi) {
            list.add(bmi);
        }

        @Override
        public void update(Bmi bmi, int i) {
            list.set(i, bmi);

        }

        @Override
        public void delete(Bmi bmi) {
            list.remove(bmi);
        }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findById(int i) {
            return null;
        }


        @Override
        public List<Bmi> findByGender(String gender) {
            return filterBmiByGender(this.list,gender);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear();
        }
    }
    static List<Bmi> filterBmiByGender(List<Bmi> list, String gender){
        List<Bmi> result = new ArrayList<>();
        for(Bmi bmi: list){
            if(gender.equals(bmi.getGender())){
                result.add(bmi);
            }
        }
        return result;
    }
}
