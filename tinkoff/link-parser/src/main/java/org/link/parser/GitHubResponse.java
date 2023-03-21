package org.link.parser;


public record GitHubResponse(String user, String repository) implements UrlParserResponse {
}