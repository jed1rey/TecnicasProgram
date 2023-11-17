import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;


public class App {
        public void gerarSticker() throws IOException{
            //leitura da imagem
            BufferedImage ImagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));
    
            //criar nova imagem em memoria com transparencia e com tamanho novo
            int largura = ImagemOriginal.getWidth();
            int altura = ImagemOriginal.getHeight();
            int novaAltura = altura + 200;
            BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TYPE_INT_ARGB);
    
            // copiar a imagem original para a nova imagem (em memoria)
            Graphics2D Graphics = (Graphics2D) novaImagem.getGraphics();
            Graphics.drawImage(ImagemOriginal, 0, 0, null);

    
            //escrever uma msg na nova imagem
            
            var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 50);
            Graphics.setFont(fonte);
            Graphics.setColor(Color.white);
            Graphics.drawString("texto teste", 20, novaAltura-50);
    
            //sobrescrever a nova imagem em um arquivo
            ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));
    
        }
        
    
    
    public static void main(String[] args) throws Exception {
        var gerador = new App();
        gerador.gerarSticker();
        
    }
}