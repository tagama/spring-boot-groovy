package demo

import demo.entity.Produto
import demo.persistence.ProdutoRepository
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct
import javax.annotation.Resource

@SpringBootApplication
class DemoApplication {

    @Resource
    ProdutoRepository produtoRepository

    static void main(String[] args) {
        SpringApplication.run DemoApplication, args
    }

    @PostConstruct
    void init() {
        100.times {
//            produtoRepository.save( [nome:"Thiago $it", dataCriacao: new Date()] as Produto )
            produtoRepository.save new Produto( nome:"Thiago $it", dataCriacao: new Date())
        }
    }
}
