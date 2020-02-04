package be.hogent.eindproject.DTO.mappers;

import be.hogent.eindproject.DTO.WaiterDTO;
import be.hogent.eindproject.model.Waiter;

public class WaiterMapper {
    public static WaiterDTO mapToWaiterDTO(Waiter waiter){

        WaiterDTO waiterDTO = new WaiterDTO();
        waiterDTO.setId(waiter.getId());
        waiterDTO.setFirstName(waiter.getFirstName());
        waiterDTO.setLastName(waiter.getLastName());
        waiterDTO.setPassword(waiter.getPassword());
        return waiterDTO;
    }

    public static Waiter mapToWaiter(WaiterDTO waiterDTO){
        return new Waiter(
                waiterDTO.getId(),
                waiterDTO.getLastName(),
                waiterDTO.getFirstName(),
                waiterDTO.getPassword()
        );
    }
}
