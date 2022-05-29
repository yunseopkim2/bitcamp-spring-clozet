package kr.co.clozet.lambda.dataStructure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

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
public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while(true){
            System.out.println("0.Exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0": break;
                case "1":
                    Member kim = new Member.Builder("kim")
                            .email("dbstjqdlwksj@naver.com")
                            .password("1")
                            .name("김윤섭")
                            .phone("010-0000-0000")
                            .profileImg("kim.jpg")
                            .build();
                    service.save(kim);
                    Member hong = new Member.Builder("hong")
                            .email("kim@test.com")
                            .password("1")
                            .name("김유신")
                            .phone("010-0044-9944")
                            .profileImg("kim.jpg")
                            .build();
                    service.save(hong);
                    Member you = new Member.Builder("you")
                            .email("you@test.com")
                            .password("1")
                            .name("유관순")
                            .phone("010-0880-9889")
                            .profileImg("you.jpg")
                            .build();
                    service.save(you);
                    System.out.println(kim);
                    System.out.println(hong);
                    System.out.println(you);
                    break;
                case "2":
                    Member data = new Member();
                    service.update(data);
                    break;
                case "3":
                    Member temp = new Member();
                    temp.setUserid("kim");
                    service.delete(temp);
                    System.out.println(temp);
                break;
                case "4":
                    System.out.println("찾을 아이디 입력하세요.");
                    System.out.println(service.findById(s.next()));
                    break;
                case "5":

                    break;
                case "6":
                    System.out.println(service.findAll());
                    break;
                case "7":
                    System.out.println(service.count()); break;
                case "8":
                    System.out.println("사용할 아이디를 입력하세요.");
                   String res = (service.existsById(s.next())) ? "이미 등록된 아이디입니다." : "사용가능한 아이디입니다.";
                    System.out.println(res);
                    break;
                case "9": service.clear(); break;
                default: break;
            }
        }
    }
    @Data @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder){
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }
        static class Builder{
            private String userid, name, password, profileImg, phone, email;


            public Builder (String userid){this.userid=userid;}
            public Builder name(String name){this.name=name; return this;}
            public Builder password(String password){this.password=password; return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone(String phone){this.phone=phone; return this;}
            public Builder email(String email){this.email=email; return this;}
            Member build(){return new Member(this);}
        }

        @Override
        public String toString(){
            return String.format( "[사용자 스펙] userid: %s, name: %s, password: %s, profuleImg: %s, phone: %s, email: %s",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String userid);
        List<Member> findByName(String name);
        List<Member> findAll();
        int count();
        boolean existsById(String userid);
        void clear();
    }

    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;
        MemberServiceImpl(){
            map = new HashMap<>();
        }
    @Override
    public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.get(member.userid);
        map.replace(member.getUserid(), member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid());
        }

        @Override
        public Member findById(String userid) {
            return map.get(userid);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public List<Member> findAll() {
            return new ArrayList<>(map.values());

        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existsById(String userid) {
            return map.containsKey(userid);
        }
        @Override
        public void clear() {
            map.clear();
        }


    }


}
