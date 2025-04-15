

# ** App: Robô Aspirador Inteligente** 🤖🧹

## **Descrição do Projeto** 📝
Este projeto emula um sistema inteligente baseado em agentes, onde um robô aspirador navega entre salas, detecta sujeiras e realiza a limpeza de forma automatizada. A aplicação utiliza tecnologias modernas como **Cartago**, **JaCaMo** e **Java**. Além disso, configuramos o ambiente de desenvolvimento no **Windows** com o **WSL** para maior flexibilidade. 💻

---

## **Tecnologias Utilizadas** 🛠️
- **Cartago**: Framework para desenvolvimento de artefatos em sistemas multiagentes.
- **JaCaMo**: Plataforma integrada para agentes e organizações.
- **Java (JDK 21)**: Linguagem principal para construção do artefato.
- **Windows Subsystem for Linux (WSL)**: Para integração entre sistemas Windows e Linux.
- **Ubuntu 24.04**: Sistema Linux emulado via WSL.

---

## **Configuração do Ambiente** 🌍

### **Habilitar o WSL e Instalar o Ubuntu 24.04**
1. Abra o **Painel de Controle** no Windows e procure por "Programas e Recursos". Clique em "Ativar ou desativar recursos do Windows". ⚙️
2. Habilite as seguintes opções:
   - ✅ Subsistema do Windows para Linux.
   - ✅ Plataforma de Máquina Virtual.
3. Reinicie o computador. 🔄
4. No **PowerShell**, execute: `wsl --install -d Ubuntu-24.04`. O sistema baixará e instalará o Ubuntu no WSL. 🐧
5. Digite `wsl` no PowerShell para acessar o Ubuntu. Será solicitado criar um usuário e senha. 🛡️
6. No Explorador de Arquivos do Windows, aparecerá uma nova unidade para acessar arquivos do Ubuntu. 🗂️

---

### **Instalar o Java JDK 21 no Ubuntu**
1. Baixe o arquivo JDK 21 no [site oficial da Oracle](https://download.oracle.com/java/21/latest/jdk-21_linux-x64_bin.deb). 📥
2. No Ubuntu, navegue até o local do arquivo e execute:
   ```
   sudo dpkg -i jdk-21_linux-x64_bin.deb
   ```
3. Teste a instalação com o comando: `java --version`. O console deve exibir algo como:
   ```
   java 21.0.6 2025-01-21 LTS
   ```

---

### **Instalar o JaCaMo**
1. Adicione o repositório do JaCaMo:
   ```
   sudo echo "deb [trusted=yes] http://packages.chon.group/ chonos main" | sudo tee /etc/apt/sources.list.d/chonos.list
   ```
2. Atualize os pacotes:
   ```
   sudo apt update
   ```
3. Instale o JaCaMo:
   ```
   sudo apt install jacamo-cli
   ```

---

## **Criando e Executando o Projeto** 🏗️
1. Crie sua aplicação:
   ```
   jacamo app create app_teste
   ```
2. Navegue para a pasta criada:
   ```
   cd app_teste
   ```
3. Execute a aplicação:
   ```
   jacamo app_teste.jcm
   ```
   **Nota:** Caso ocorra algum erro, tente executar o comando novamente. Às vezes, o JaCaMo demora para baixar o `gradle`. 😅

4. Com tudo funcionando, você verá mensagens como:
   ```
   BUILD SUCCESSFUL in 3s
   ```
   A partir daí, edite e execute sua aplicação conforme necessário. 🎉

---

## **Observações Importantes** ⚠️
- **Correção de código nos slides:** A linha `makeArtifact("rooms","my_first_app.Rooms",[2],ID)` está errada. O correto é: `makeArtifact("rooms","Rooms",[2],ID)`.
- Adicione esta linha no arquivo `Rooms.java` para permitir a geração aleatória de sujeira:
  ```java
  import java.util.Random;
  ```

---
BY: Carol Pontara

---

