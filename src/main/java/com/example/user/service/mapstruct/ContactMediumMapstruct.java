package com.example.user.service.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.example.user.service.entities.ContactMedium;
import com.example.user.service.payload.ContactMediumDTO;

@Component
@Mapper(componentModel = "spring")
public interface ContactMediumMapstruct {
	
	   ContactMedium toEntity(ContactMediumDTO contactMediumDTO);
	   
	   ContactMediumDTO toDto(ContactMedium contactMedium);
		
	   List<ContactMediumDTO> toDtolist(List<ContactMedium> ContactMediumList);
	  
	   List<ContactMedium> toEntitylist(List<ContactMediumDTO> contactMediumDTOList);
		
}
