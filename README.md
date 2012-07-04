sbt-actor-object-testcase
=========================

A test case for SBT test covering actor objects.

SBT 0.12 test halts if there are object involved that are actors. Since these are started, but not stoped, "sbt test" will run forever.

Try it by doing

    sbt test


