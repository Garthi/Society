package mod.society.utilities.books;

import mod.society.common.modules.ModItems;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Martin "Garth" Zander <garth@new-crusader.de>
 */
public class BookModelBarkeeper extends BookModelAbstract
{
    public static final ModelResourceLocation modelResourceLocation = new ModelResourceLocation(
            ModItems.BOOK_BARKEEPER.getRegistryName().toString()
    );
    
    @SideOnly(Side.CLIENT)
    public BookModelBarkeeper(IBakedModel parent)
    {
        super(parent);
    }
    
    protected String getBookName()
    {
        return new TextComponentTranslation("item.society.book_barkeeper.name").getFormattedText();
    }
}
