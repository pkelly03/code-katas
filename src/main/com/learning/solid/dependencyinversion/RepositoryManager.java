package com.learning.solid.dependencyinversion;

public class RepositoryManager
{
  public ContentNode getNodeByUuid(String id)
  {
    ContentNode node = new ContentNode();

    node.addProperty("uuid", id);

    return node;
  }
}
