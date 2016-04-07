package project.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import project.repositories.SearchResult;

public class Representation {

    private String searchResult;

    public Representation() {

    }

    public Representation(SearchResult searchResult) {
        this.searchResult = searchResult.getResult();
    }

    @JsonProperty
    public String getSearchResult() {
        return searchResult;
    }
}
