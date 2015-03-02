package demo.controller

import demo.entity.Produto
import demo.persistence.ProdutoRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.Resource

/**
 * Created by Thiago on 28/02/2015.
 */
@RestController("Produto")
class ProdutoController {

    @Resource
    ProdutoRepository produtoRepository

    @RequestMapping("/")
    Page<Produto> findAll(Pageable pageable) {
        return produtoRepository.findAll(pageable)
    }

}
