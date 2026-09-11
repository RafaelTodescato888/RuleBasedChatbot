package domain;

import java.util.ArrayList;
import java.util.List;

import application.helpers.TextHelper;

public class IntentionTreeNode {
    private String intention;
    private List<IntentionTreeNode> children;
    private String response;

    public IntentionTreeNode(String intention, List<IntentionTreeNode> children, String response) {
        this.intention = intention;
        this.children = children;
        this.response = response;
    }

    public IntentionTreeNode(String intention, List<IntentionTreeNode> children) {
        this.intention = intention;
        this.children = children;
        this.response = "";
    }

    public IntentionTreeNode(String intention, String response) {
        this.intention = intention;
        this.response = response;
        this.children = new ArrayList<>();
    }

    public String getIntention() {
        return this.intention;
    }

    public List<IntentionTreeNode> getChildren() {
        return this.children;
    }

    public String getResponse() {
        return this.response;
    }

    public boolean isEmpty() {
        return this.children.isEmpty();
    }

    public boolean containsResponse() {
        return !TextHelper.isNullOrEmpty(response);
    }
}
