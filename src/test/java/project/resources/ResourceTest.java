package project.resources;

import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.BadRequestException;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourceTest {

    private static final String ENV_ACCOUNT = "localAccount";
    private static final String ENV_ACCOUNT_INCORRECT = "qaAccount";
    private static final String SEARCH_TERM = "1";
    private static final String SEARCH_RESULT = "item1";

    private Resource resource;

    @Before
    public void beforeEachTest() throws Exception {
        resource = new Resource(ENV_ACCOUNT);
    }

    @Test
    public void shouldCallRepositoryAndReturnSearchResult() throws Exception {
        Representation representation = resource.search(ENV_ACCOUNT, SEARCH_TERM);
        assertThat(representation.getSearchResult()).isEqualTo(SEARCH_RESULT);
    }

    @Test (expected = BadRequestException.class)
    public void shouldThrowExceptionWhenIncorrectAccountUsed() throws Exception {
        resource.search(ENV_ACCOUNT_INCORRECT, SEARCH_TERM);
    }

}
