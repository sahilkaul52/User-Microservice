package com.example.user.service.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.example.user.service.entities.Identification;
import com.example.user.service.payload.IdentificationDTO;

@Component
@Mapper(componentModel = "spring")
public interface IdentificationMapstruct 
{

   Identification toEntity(IdentificationDTO identificatonDTO);
  

   IdentificationDTO toDto(Identification identification);
	
  
   List<IdentificationDTO> toDtoList(List<Identification> identificatonList);
  

   List<Identification> toEntitylist(List<IdentificationDTO> identificationDTOList);
	
	
	
}
