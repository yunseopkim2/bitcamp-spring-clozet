package kr.co.clozet.clozet.controllers;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Board;
import kr.co.clozet.clozet.domains.Closet;
import kr.co.clozet.clozet.services.BoardService;
import kr.co.clozet.clozet.services.ClosetService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName    : kr.co.clozet.clozet.controllers
 * fileName       : BoardController
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Board>> findAll() {return ResponseEntity.ok(service.findAll());}

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<Board>> findAll(Sort sort) {return ResponseEntity.ok(service.findAll(sort));}

    @GetMapping("/findAll/pageable")
    public ResponseEntity<Page<Board>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));}

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {return ResponseEntity.ok(service.count());}



    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(@RequestBody Board board) {
        return ResponseEntity.ok(service.delete(board));}


    @GetMapping("/findById/{userId}")
    public ResponseEntity<Board> findByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(service.findByUserId(userId));}


    @GetMapping("/getOne/{id}")
    public ResponseEntity<Messenger> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOne(id));}

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody Board board) {
        return ResponseEntity.ok(service.update(board));
    }
}
