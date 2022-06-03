package kr.co.clozet.clozet.controllers;

import kr.co.clozet.auth.domains.Messenger;
import kr.co.clozet.clozet.domains.Clothes;
import kr.co.clozet.clozet.domains.User;
import kr.co.clozet.clozet.services.ClothesService;
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
 * fileName       : ClothesController
 * author         : kimyunseop
 * date           : 2022-05-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-31        kimyunseop       최초 생성
 */
@RestController
@RequestMapping("/clothes")
@RequiredArgsConstructor
public class ClothesController {
    private final ClothesService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Clothes>> findAll() {return ResponseEntity.ok(service.findAll());}

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<Clothes>> findAll(Sort sort) {return ResponseEntity.ok(service.findAll(sort));}

    @GetMapping("/findAll/pageable")
    public ResponseEntity<Page<Clothes>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));}

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {return ResponseEntity.ok(service.count());}



    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(@RequestBody Clothes clothes) {
        return ResponseEntity.ok(service.delete(clothes));}


    @GetMapping("/findById/{userId}")
    public ResponseEntity<Optional<Clothes>> findByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(service.findByUserId(userId));}


    @GetMapping("/getOne/{id}")
    public ResponseEntity<Messenger> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(service.getOne(id));}

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody Clothes clothes) {
        return ResponseEntity.ok(service.update(clothes));
}}
