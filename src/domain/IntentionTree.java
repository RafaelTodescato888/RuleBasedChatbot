package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IntentionTree {
    private List<IntentionTreeNode> nodes;

    public IntentionTree() {
        nodes = new ArrayList<>();
    }

    public List<IntentionTreeNode> getNodes() {
        return nodes;
    }

    public void build(List<IntentionTreeNode> nodes) {
        this.nodes = nodes;
    }

    public void add(IntentionTreeNode node) {
        this.nodes.add(node);
    }

    public String getIntetionResponseByWords(List<String> words) {
        List<IntentionTreeNode> nodesToValidate = this.nodes;

        while (!nodesToValidate.isEmpty()) {
            Optional<IntentionTreeNode> nodeFound = getNodeByWords(nodesToValidate, words);
            if (nodeFound.isEmpty())
                break;

            IntentionTreeNode nodeFoundValue = nodeFound.get();

            if (!nodeFoundValue.isEmpty() && !nodeFoundValue.containsResponse()) {
                nodesToValidate = nodeFoundValue.getChildren();
            }

            if (nodeFoundValue.isEmpty() && nodeFoundValue.containsResponse()) {
                return nodeFoundValue.getResponse();
            }
        }

        return null;
    }

    private Optional<IntentionTreeNode> getNodeByWords(List<IntentionTreeNode> nodes, List<String> words) {
        return nodes.stream().filter(node -> words.contains(node.getIntention())).findFirst();
    }
}
