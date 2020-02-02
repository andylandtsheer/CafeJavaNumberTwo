package be.hogent.eindproject.DTO.mappers;

import be.hogent.eindproject.DTO.BeverageDTO;
import be.hogent.eindproject.model.Beverage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BeverageMapperTest {

    @Test
    void givenBeverage_whenMapToBeverageDTO_thenTheCorrectBeverageDTOIsProvided() {
        //given
        int beverageId = 1;
        String beverageName = "testDrink";
        double beveragePrice = 25.15;
        Beverage beverage = new Beverage(beverageId, beverageName, beveragePrice);

        //when
        BeverageDTO beverageDTO = BeverageMapper.mapToBeverageDTO(beverage);

        //then
        assertThat(beverageDTO.getBeverageID()).isEqualTo(beverageId);
        assertThat((beverageDTO.getBeverageName())).isEqualTo(beverageName);
        assertThat(beverageDTO.getPrice()).isEqualTo(beveragePrice);
    }

    @Test
    void givenBeverageDTO_whenMapToBeverage_thenTheCorrectBeverageIsProvided(){
        //given
        int beverageId = 1;
        String beverageName = "testDrink";
        double beveragePrice = 25.15;
        BeverageDTO beverageDTO = new BeverageDTO();
        beverageDTO.setPrice(beveragePrice);
        beverageDTO.setBeverageName(beverageName);
        beverageDTO.setBeverageID(beverageId);

        //when
        Beverage beverage = BeverageMapper.mapToBeverage(beverageDTO);

        //then
        assertThat(beverage.getBeverageID()).isEqualTo(beverageId);
        assertThat((beverage.getBeverageName())).isEqualTo(beverageName);
        assertThat(beverage.getPrice()).isEqualTo(beveragePrice);
    }
}