FROM airhacks/glassfish
COPY ./target/pw-Leone.war ${DEPLOYMENT_DIR}
