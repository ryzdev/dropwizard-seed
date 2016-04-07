package project.repositories;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DBRepositoryTest {

    @Test
    public void shouldReturnSearchResult() throws Exception {
        DBRepository repository = new DBRepository();
        SearchResult searchResult = repository.searchFor("1");
        assertThat(searchResult.getResult()).isEqualTo("item1");
    }

}