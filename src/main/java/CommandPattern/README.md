# The Command pattern wraps a request into a standalone object that contains all the information related to the request.
# This transformation allows us to parameterize clients with queues, requests and operations. It allows us to support undoable operations.

# This works by placing all the nodes/ virtual nodes on a ring called hashRing and placing all the hashes of key linearly on the hashRing while storing keys only in node/virtual nodes which are nearest to them. This reduces the amount of redistribution of keys needed when adding or removing nodes.

# Application of hashing algorithm:
