package demo.persistence

import demo.entity.Produto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by Thiago on 28/02/2015.
 */
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long>{

    Page<Produto> findAll(Pageable pageable)

}