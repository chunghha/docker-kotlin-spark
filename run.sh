#!/usr/bin/env bash

docker build . -t kotlin-spark
docker run -i -t -p 4567:4567 kotlin-spark