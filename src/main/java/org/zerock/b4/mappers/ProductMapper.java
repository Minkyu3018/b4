package org.zerock.b4.mappers;

import java.util.List;
import java.util.Map;

import org.zerock.b4.dto.PageRequestDTO;
import org.zerock.b4.dto.ProductListDTO;
import org.zerock.b4.dto.ProductRegisterDTO;

public interface ProductMapper {
    
    List<ProductListDTO> getList(PageRequestDTO PageRequestDTO);

    int insertProduct(ProductRegisterDTO registerDTO);

    // 람다식으로

    int insertImages(List<Map<String,String>> imageList);



}
