FROM ubuntu:20.04
# SHELL ["/bin/bash", "-C"]

RUN apt-get update && \
    apt-get install -y wget git unzip

RUN cd /usr/share && \
    wget https://aka.ms/download-jdk/microsoft-jdk-11.0.15-linux-x64.tar.gz && \
    tar xvf microsoft-jdk-11.0.15-linux-x64.tar.gz && \
    ln -s /usr/share/jdk-11.0.15+10 /usr/share/jdk-11

ENV JAVA_HOME=/usr/share/jdk-11
ENV PATH="$PATH:$JAVA_HOME/bin"

RUN java -version

ENV TZ=Asia/Tokyo
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apt-get install -y maven

RUN apt-get install -y libstdc++5 g++ ant git openjdk-8-jdk

RUN mkdir ~/xtuml && \
    cd ~/xtuml && \
    wget https://s3.amazonaws.com/xtuml-releases/nightly-build/org.xtuml.bp-dev.product-linux.gtk.x86_64.zip && \
    unzip org.xtuml.bp-dev.product-linux.gtk.x86_64.zip;

RUN apt-get -y install software-properties-common

RUN add-apt-repository ppa:pypy/ppa && \
    apt-get update && \
    apt-get -y install pypy pypy-dev

RUN git clone https://github.com/xtuml/bridgepoint.git ~/git/bridgepoint && \
    git clone https://github.com/xtuml/bptest.git ~/git/bptest && \
    git clone https://github.com/xtuml/mc.git ~/git/mc && \
    git clone https://github.com/xtuml/pt_antlr.git ~/git/pt_antlr && \
    git clone https://github.com/xtuml/models.git ~/git/models && \
    git clone https://github.com/xtuml/packaging.git ~/git/packaging

RUN sed -i 12's/export/# export/' ~/git/bridgepoint/utilities/build/build_configuration.sh
RUN sed -i 14's/#export/export/' ~/git/bridgepoint/utilities/build/build_configuration.sh
    